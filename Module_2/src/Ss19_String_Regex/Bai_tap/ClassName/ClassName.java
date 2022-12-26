package Ss19_String_Regex.Bai_tap.ClassName;

import java.util.Scanner;

public class ClassName {

    private static final String CLASS_NAME = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        System.out.println("Enter name class: ");
        Scanner sc = new Scanner(System.in);
        String nameClass = sc.nextLine();
        System.out.println(nameClass.matches(CLASS_NAME));
    }
}
