package Ss5_Access_Modifier_Static_Method.Write_student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ngoc Truong");
        student.setClasses("C1022G1");
        System.out.println(student.getClasses());
        System.out.println(student.getName());
    }
}
