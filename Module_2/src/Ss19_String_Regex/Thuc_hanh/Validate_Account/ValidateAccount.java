package Ss19_String_Regex.Thuc_hanh.Validate_Account;

import java.util.Scanner;

public class ValidateAccount {

    private static final String REGEX_ACCOUNT = "^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name account: ");
        String nameAccount = sc.nextLine();
        System.out.println(nameAccount.matches(REGEX_ACCOUNT));
    }
}
