package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Services.IService.ICustomerService;
import CaseStudy_Module2.Services.service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagementController {

    public void customerManagement() {
        ICustomerService iCustomerService = new CustomerServiceImpl();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----Customer Management----");
            System.out.println("1.\tDisplay list customers: \n" +
                    "2.\tAdd new customer: \n" +
                    "3.\tEdit customer: \n" +
                    "4.\tReturn main menu: ");
            System.out.println("Enter the selection: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    System.out.println("Enter the ID Customer: ");
                    String newId = sc.nextLine();
                    System.out.println("Enter the Name Customer: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter the Birthday Customer:");
                    String newBirthday = sc.nextLine();
                    System.out.println("Enter the Sex Customer: ");
                    String newSex = sc.nextLine();
                    System.out.println("Enter the CMND Customer: ");
                    String newCMND = sc.nextLine();
                    System.out.println("Enter the Phone Customer: ");
                    String newPhone = sc.nextLine();
                    System.out.println("Enter the Email Customer: ");
                    String newEmail = sc.nextLine();
                    System.out.println("Enter the Type Customer: ");
                    String newType = sc.nextLine();
                    System.out.println("Enter the Address Customer: ");
                    String newAddress = sc.nextLine();
                    Customer customer = new Customer(newId, newName, newCMND, newSex, newBirthday, newPhone, newEmail,
                            newType, newAddress);
                    iCustomerService.add(customer);
                    break;
                case 3:
                    System.out.println("Enter the Id Customer:");
                    String oldId = sc.nextLine();
                    Customer ctr = iCustomerService.findById(oldId);
                    if (ctr != null) {
                        System.out.println("Enter the Name Customer: ");
                        String newName1 = sc.nextLine();
                        System.out.println("Enter the Birthday Customer:");
                        String newBirthday1 = sc.nextLine();
                        System.out.println("Enter the Sex Customer: ");
                        String newSex1 = sc.nextLine();
                        System.out.println("Enter the CMND Customer: ");
                        String newCMND1 = sc.nextLine();
                        System.out.println("Enter the Phone Customer: ");
                        String newPhone1 = sc.nextLine();
                        System.out.println("Enter the Email Customer: ");
                        String newEmail1 = sc.nextLine();
                        System.out.println("Enter the Type Customer: ");
                        String newType1 = sc.nextLine();
                        System.out.println("Enter the Address Customer: ");
                        String newAddress1 = sc.nextLine();
                        ctr.setName(newName1);
                        ctr.setDateBirth(newBirthday1);
                        ctr.setSex(newSex1);
                        ctr.setcMND(newCMND1);
                        ctr.setNumberPhone(newPhone1);
                        ctr.setEmail(newEmail1);
                        ctr.setCustomerType(newType1);
                        ctr.setAddress(newAddress1);
                        iCustomerService.editCustomer(ctr);
                    } else {
                        System.out.println("Id Customer does not exist: ");
                    }
                    break;
                case 4:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                default:
                    System.out.println("Please choice again: ");

            }
        } while (true);
    }
}
