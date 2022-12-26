package Ss19_String_Regex.Bai_tap.NumberPhone;

import java.util.Scanner;

public class NumberPhone {

    private static final String REGEX_NUMBER = "^[(]84[)][-][(]0[0-9]{9}[)]$";

    public static void main(String[] args) {
        System.out.println("Enter the number phone: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        System.out.println(phone.matches(REGEX_NUMBER));
    }

}
