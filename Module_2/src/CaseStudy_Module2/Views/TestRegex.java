package CaseStudy_Module2.Views;

import java.util.Scanner;

public class TestRegex {


    private static final String REGEX = "(^[12][0-9]{2,}|[3-9][0-9]+)m2$";

    public static void main(String[] args) {
        System.out.println("...");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(test.matches(REGEX));
    }
}
