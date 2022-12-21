package Ss15_Exception.Thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số của 1 phần tử bất kì: ");
        int number = sc.nextInt();
        try {
            System.out.println("giá trị phần tử có chỉ số  " + number + " là: " + array[number]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn: ");
        }
    }
}
