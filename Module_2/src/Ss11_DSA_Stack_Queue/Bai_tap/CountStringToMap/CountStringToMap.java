package Ss11_DSA_Stack_Queue.Bai_tap.CountStringToMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountStringToMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine().toLowerCase();
        String[] str1 = str.split(" ");
        for (String s: str1 ) {
            if (treeMap.containsKey(s)) {
                int value = treeMap.get(s);
                value++;
                treeMap.replace(s, value);
            } else {
                treeMap.put(s, 1);
            }
        }
        System.out.println("Số lần xuất hiện của các từ: ");
        System.out.println(treeMap);
    }
}
