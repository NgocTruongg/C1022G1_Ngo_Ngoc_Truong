package Ss10_DSA_Danhsach.Bai_tap;

public class MyTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Ngô");
        Student student2 = new Student(2, "Ngọc");
        Student student3 = new Student(3, "Trường");
        Student student4 = new Student(4, "Học đi");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
//        studentMyList.clear();

//        for (int i = 0; i < studentMyList.size() ; i++) {
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.id);
//            System.out.println(student.name);
////            System.out.println(student);
//        System.out.println(studentMyList.get(2).getName());
//        System.out.println(studentMyList.contains(student3));
        newMyList = studentMyList.clone();
        for (int i = 0; i < newMyList.size() ; i++) {
            System.out.println(newMyList.get(i).getName());
        }



    }
}
