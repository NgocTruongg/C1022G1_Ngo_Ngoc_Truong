package Ss12_Framework.Thuc_hanh;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Truong", 24);
        hashMap.put("Song", 24);
        hashMap.put("Son", 24);
        hashMap.put("Y", 24);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Truong", 24);
        linkedHashMap.put("Song", 24);
        linkedHashMap.put("Son", 24);
        linkedHashMap.put("Y", 24);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Truong"));
    }
}
