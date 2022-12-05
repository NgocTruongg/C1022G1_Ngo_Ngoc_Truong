package Ss2_Array;

public class SmallestElement {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }

    }
}
