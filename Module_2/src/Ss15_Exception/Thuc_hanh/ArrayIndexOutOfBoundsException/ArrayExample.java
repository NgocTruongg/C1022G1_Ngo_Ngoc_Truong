package Ss15_Exception.Thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[50];
        System.out.print("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 50 ; i++) {
            array[i]= random.nextInt(50);
            System.out.println(array[i] + " ");
        }
        return array;
    }
}

