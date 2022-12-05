package Bai_tap;

import java.util.Scanner;

public class ChangeNumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi: ");
        String number = scanner.nextLine();

        String aDigit;
        if (number.length() == 1) {
            switch (number) {
                case "0":
                    aDigit = "Zero";
                case "1":
                    aDigit = "One";
                    break;
                case "2":
                    aDigit = "Two";
                    break;
                case "3":
                    aDigit = "Three";
                    break;
                case "4":
                    aDigit = "Four";
                    break;
                case "5":
                    aDigit = "Fine";
                    break;
                case "6":
                    aDigit = "Six";
                    break;
                case "7":
                    aDigit = "Seven";
                    break;
                case "8":
                    aDigit = "Eight";
                    break;
                case "9":
                    aDigit = "Nine";
                    break;
            }
        } else if (number.length() == 2) {
            if (Integer.parseInt(number) < 20) {
                switch (number) {
                    case "10":
                        aDigit = "Ten";
                    case "11":
                        aDigit = "Eleven";
                        break;
                    case "12":
                        aDigit = "Twelve";
                        break;
                    case "13":
                        aDigit = "Thirteen";
                        break;
                    case "14":
                        aDigit = "Fourteen";
                        break;
                    case "15":
                        aDigit = "Fifteen";
                        break;
                    case "16":
                        aDigit = "Sixteen";
                        break;
                    case "17":
                        aDigit = "Seventeen";
                        break;
                    case "18":
                        aDigit = "Eigthteen";
                        break;
                    case "19":
                        aDigit = "Nineteen";
                        break;
                }
            } else {
                switch (number.substring(0, 1)) {
                    case "2":
                        aDigit = "Twenty ";
                        break;
                    case "3":
                        aDigit = "Thirty ";
                        break;
                    case "4":
                        aDigit = "Forty ";
                        break;
                    case "5":
                        aDigit = "Fifty ";
                        break;
                    case "6":
                        aDigit = "Sixty ";
                        break;
                    case "7":
                        aDigit = "Seventy ";
                        break;
                    case "8":
                        aDigit = "Eighty ";
                        break;
                    case "9":
                        aDigit = "Ninety ";
                        break;
                }
                switch (number.substring(1)) {
                    case "0":
                        aDigit = "";
                        break;
                    case "1":
                        aDigit = "One";
                        break;
                    case "2":
                        aDigit = "Two";
                        break;
                    case "3":
                        aDigit = "Three";
                        break;
                    case "4":
                        aDigit = "Four";
                        break;
                    case "5":
                        aDigit = "Five";
                        break;
                    case "6":
                        aDigit = "Six";
                        break;
                    case "7":
                        aDigit = "Seven";
                        break;
                    case "8":
                        aDigit = "Eight";
                        break;
                    case "9":
                        aDigit = "Nine";
                        break;
                }
            }
        } else {
            switch (number.charAt(0)) {
                case '1':
                    aDigit = "One Hundred ";
                    break;
                case '2':
                    aDigit = "Two Hundred ";
                    break;
                case '3':
                    aDigit = "Three Hundred ";
                    break;
                case '4':
                    aDigit = "Four Hundred ";
                    break;
                case '5':
                    aDigit = "Five Hundred ";
                    break;
                case '6':
                    aDigit = "Six Hundred ";
                    break;
                case '7':
                    aDigit = "Seven Hundred ";
                    break;
                case '8':
                    aDigit = "Eight Hundred ";
                    break;
                case '9':
                    aDigit = "Nine Hundred ";
                    break;
            }
        }
        if (Integer.parseInt(String.valueOf(number.charAt(1))) == 0) {
            switch (number.charAt(2)) {
                case '0':
                    aDigit = "";
                    break;
                case '1':
                    aDigit = "One";
                    break;
                case '2':
                    aDigit = "Two";
                    break;
                case '3':
                    aDigit = "Three";
                    break;
                case '4':
                    aDigit = "For";
                    break;
                case '5':
                    aDigit = "Five";
                    break;
                case '6':
                    aDigit = "Six";
                    break;
                case '7':
                    aDigit = "Seven";
                    break;
                case '8':
                    aDigit = "Eight";
                    break;
                case '9':
                    aDigit = "Nine";
                    break;
            }
        } else if (Integer.parseInt(String.valueOf(number.charAt(1))) == 1) {
            switch (number.charAt(2)) {
                case '0':
                    aDigit = "Ten";
                    break;
                case '1':
                    aDigit = "Eleven";
                    break;
                case '2':
                    aDigit = "Twelve";
                    break;
                case '3':
                    aDigit = "Thirteen";
                    break;
                case '4':
                    aDigit = "Fourteen";
                    break;
                case '5':
                    aDigit = "Fifteen";
                    break;
                case '6':
                    aDigit = "Sixteen";
                    break;
                case '7':
                    aDigit = "Seventeen";
                    break;
                case '8':
                    aDigit = "Eighteen";
                    break;
                case '9':
                    aDigit = "Nineteen";
                    break;
            }
        } else {
            switch (number.charAt(1)) {
                case '2':
                    aDigit = "Twenty ";
                    break;
                case '3':
                    aDigit = "Thirty ";
                    break;
                case '4':
                    aDigit = "Forty ";
                    break;
                case '5':
                    aDigit = "Fifty ";
                    break;
                case '6':
                    aDigit = "Sixty ";
                    break;
                case '7':
                    aDigit = "Seventy ";
                    break;
                case '8':
                    aDigit = "Eighty ";
                    break;
                case '9':
                    aDigit = "Ninety ";
                    break;
            }
            switch (number.charAt(2)) {
                case '0':
                    aDigit = "";
                    break;
                case '1':
                    aDigit = "One";
                    break;
                case '2':
                    aDigit = "Two";
                    break;
                case '3':
                    aDigit = "Three";
                    break;
                case '4':
                    aDigit = "Four";
                    break;
                case '5':
                    aDigit = "Five";
                    break;
                case '6':
                    aDigit = "Six";
                    break;
                case '7':
                    aDigit = "Seven";
                    break;
                case '8':
                    aDigit = "Eight";
                    break;
                case '9':
                    aDigit = "Nine";
                    break;
            }
        }
    }
}

