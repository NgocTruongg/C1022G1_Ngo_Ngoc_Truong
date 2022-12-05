package ss1;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        String number = sc.nextLine();
        if (number.length() == 1) {
            switch (number) {
                case "0":
                    System.out.println("Zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("For");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
            }
        } else if (number.length() == 2) {
            if (Integer.parseInt(number) < 20) {
                switch (number) {
                    case "10":
                        System.out.println("Ten");
                        break;
                    case "11":
                        System.out.println("Eleven");
                        break;
                    case "12":
                        System.out.println("Twelve");
                        break;
                    case "13":
                        System.out.println("Thirteen");
                        break;
                    case "14":
                        System.out.println("Fourteen");
                        break;
                    case "15":
                        System.out.println("Fifteen");
                        break;
                    case "16":
                        System.out.println("Sixteen");
                        break;
                    case "17":
                        System.out.println("Seventeen");
                        break;
                    case "18":
                        System.out.println("Eigthteen");
                        break;
                    case "19":
                        System.out.println("Nineteen");
                        break;
                }
            } else {
                switch (number.substring(0, 1)) {
                    case "2":
                        System.out.print("Twenty ");
                        break;
                    case "3":
                        System.out.print("Thirty ");
                        break;
                    case "4":
                        System.out.print("Forty ");
                        break;
                    case "5":
                        System.out.print("Fifty ");
                        break;
                    case "6":
                        System.out.print("Sixty ");
                        break;
                    case "7":
                        System.out.print("Seventy ");
                        break;
                    case "8":
                        System.out.print("Eighty ");
                        break;
                    case "9":
                        System.out.print("Ninety ");
                        break;
                }
                switch (number.substring(1)) {
                    case "0":
                        System.out.print("");
                        break;
                    case "1":
                        System.out.print("One");
                        break;
                    case "2":
                        System.out.print("Two");
                        break;
                    case "3":
                        System.out.print("Three");
                        break;
                    case "4":
                        System.out.print("Four");
                        break;
                    case "5":
                        System.out.print("Five");
                        break;
                    case "6":
                        System.out.print("Six");
                        break;
                    case "7":
                        System.out.print("Seven");
                        break;
                    case "8":
                        System.out.print("Eight");
                        break;
                    case "9":
                        System.out.print("Nine");
                        break;
                }
            }
        } else {
            switch (number.charAt(0)) {
                case '1':
                    System.out.print("One Hundred ");
                    break;
                case '2':
                    System.out.print("Two Hundred ");
                    break;
                case '3':
                    System.out.print("Three Hundred ");
                    break;
                case '4':
                    System.out.print("Four Hundred ");
                    break;
                case '5':
                    System.out.print("Five Hundred ");
                    break;
                case '6':
                    System.out.print("Six Hundred ");
                    break;
                case '7':
                    System.out.print("Seven Hundred ");
                    break;
                case '8':
                    System.out.print("Eight Hundred ");
                    break;
                case '9':
                    System.out.print("Nine Hundred ");
                    break;
            }
            if (Integer.parseInt(String.valueOf(number.charAt(1))) == 0) {
                switch (number.charAt(2)) {
                    case '0':
                        System.out.println("");
                        break;
                    case '1':
                        System.out.println("One");
                        break;
                    case '2':
                        System.out.println("Two");
                        break;
                    case '3':
                        System.out.println("Three");
                        break;
                    case '4':
                        System.out.println("For");
                        break;
                    case '5':
                        System.out.println("Five");
                        break;
                    case '6':
                        System.out.println("Six");
                        break;
                    case '7':
                        System.out.println("Seven");
                        break;
                    case '8':
                        System.out.println("Eight");
                        break;
                    case '9':
                        System.out.println("Nine");
                        break;
                }
            } else if (Integer.parseInt(String.valueOf(number.charAt(1))) == 1) {
                switch (number.charAt(2)) {
                    case '0':
                        System.out.print("Ten");
                        break;
                    case '1':
                        System.out.print("Eleven");
                        break;
                    case '2':
                        System.out.print("Twelve");
                        break;
                    case '3':
                        System.out.print("Thirteen");
                        break;
                    case '4':
                        System.out.print("Fourteen");
                        break;
                    case '5':
                        System.out.print("Fifteen");
                        break;
                    case '6':
                        System.out.print("Sixteen");
                        break;
                    case '7':
                        System.out.print("Seventeen");
                        break;
                    case '8':
                        System.out.print("Eighteen");
                        break;
                    case '9':
                        System.out.print("Nineteen");
                        break;
                }
            }
            else {
                switch (number.charAt(1)) {
                    case '2':
                        System.out.print("Twenty ");
                        break;
                    case '3':
                        System.out.print("Thirty ");
                        break;
                    case '4':
                        System.out.print("Forty ");
                        break;
                    case '5':
                        System.out.print("Fifty ");
                        break;
                    case '6':
                        System.out.print("Sixty ");
                        break;
                    case '7':
                        System.out.print("Seventy ");
                        break;
                    case '8':
                        System.out.print("Eighty ");
                        break;
                    case '9':
                        System.out.print("Ninety ");
                        break;
                }
                switch (number.charAt(2)) {
                    case '0':
                        System.out.print("");
                        break;
                    case '1':
                        System.out.print("One");
                        break;
                    case '2':
                        System.out.print("Two");
                        break;
                    case '3':
                        System.out.print("Three");
                        break;
                    case '4':
                        System.out.print("Four");
                        break;
                    case '5':
                        System.out.print("Five");
                        break;
                    case '6':
                        System.out.print("Six");
                        break;
                    case '7':
                        System.out.print("Seven");
                        break;
                    case '8':
                        System.out.print("Eight");
                        break;
                    case '9':
                        System.out.print("Nine");
                        break;
                }
            }
        }
    }
}