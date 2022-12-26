package Ss19_String_Regex.Thuc_hanh.Validate_Email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email: ");
        String email = sc.nextLine();

        System.out.println(email.matches(EmailExample.EMAIL_REGEX));

    }
}
