package Ss2_Array.Bai_tap;

import java.util.Scanner;

public class PrinPrimes {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
