package Ss12_Framework.Thuc_hanh.HanshMapAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class classMain {
    public static void main(String[] args) {
        Student student1 = new Student("Truong", 24, "ĐN");
        Student student2 = new Student("Y", 24, "ĐN");
        Student student3 = new Student("Song", 23, "ĐN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
