package Ss13_Search_Algorithms.Thuc_hanh;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ComplexityAlgorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine().toLowerCase();
        Map<String, Integer> myTree = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (myTree.containsKey(str.charAt(i) + "")) {
                myTree.put(str.charAt(i) + "", myTree.get(str.charAt(i) + "") + 1);
            } else {
                myTree.put(str.charAt(i) + "", 1);
            }
        }
        int max = -1;
        String character = "";
        for (Map.Entry<String, Integer> entry: myTree.entrySet()) {
            for (int i = 0; i < myTree.size(); i++) {
                if (max<entry.getValue()) {
                    max =entry.getValue();
                    character = entry.getKey();
                }
            }
        }
        System.out.println("ký tự xuất hiện nhiều nhất trong mảng là : "
                + character + "\nCó số lần xuất hiện là: " +max);
    }
}
