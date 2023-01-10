package Ss12_Framework.Thuc_hanh.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Truong", 22, "ĐN");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Song", 19, "QT" );
        Student student3 = new Student("Son", 22, "QT" );

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }

}
