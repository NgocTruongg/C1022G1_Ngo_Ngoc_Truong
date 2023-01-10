package Ss3_Loop.Thuc_hanh;

import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        String[] student = {"Truong", "y", "Son", "Song", "Nhi", "Meo"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name student: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if(student[i].equals(inputName)) {
                System.out.println("position of the student in the list " + inputName + " is: " + (i+1));
                isExist = true;
                break;
            }
        }
    }
}
