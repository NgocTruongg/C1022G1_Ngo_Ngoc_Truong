package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Services.IService.IEmployeeService;
import CaseStudy_Module2.Services.service.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    Scanner scanner = new Scanner(System.in);
    public int choice = 0;

    public void displayMainMenu() {
        System.out.println("1.\tEmployee Management: \n" +
                "2.\tCustomer Management: \n" +
                "3.\tFacility Management: \n" +
                "4.\tBooking Management: \n" +
                "5.\tPromotion Management: \n" +
                "6.\tExit: ");
        do {
            System.out.println("---------Menu Selection--------");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 0 || choice > 6);
        switch (choice) {
            case 1:
                EmployeeController employeeController = new EmployeeController();
                employeeController.employeeManagement();
            case 2:

                System.out.println("Customer Management:");
                System.out.println("1.\tDisplay list customers: \n" +
                        "2.\tAdd new customer: \n" +
                        "3.\tEdit customer: \n" +
                        "4.\tReturn main menu: ");
                break;
            case 3:
                System.out.println("Facility Management:");
                System.out.println("1\tDisplay list facility: \n" +
                        "2\tAdd new facility: \n" +
                        "3\tDisplay list facility maintenance: \n" +
                        "4\tReturn main menu: ");
                break;
            case 4:
                System.out.println("Edit employee:");
                System.out.println("1.\tAdd new booking: \n" +
                        "2.\tDisplay list booking: \n" +
                        "3.\tReturn main menu: ");
                break;
            case 5:
                System.out.println("Return main menu:");
                System.out.println("1.\tDisplay list customers use service\n" +
                        "2.\tDisplay list customers get voucher\n" +
                        "3.\tReturn main menu\n");
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Vui lòng chọn lại: ");
        }
    }
}
