package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Services.IService.ICustomerService;
import CaseStudy_Module2.Services.service.CustomerServiceImpl;
import CaseStudy_Module2.Utils.RegexCode;

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
                    String newId;
                    do {
                        System.out.println("Enter ID Customer: ");
                        newId = sc.nextLine();
                    } while (!RegexCode.checkCustomerId(newId));
                    String newName;
                    do {
                        System.out.println("Enter Name Customer: ");
                        newName = sc.nextLine();
                    } while (!RegexCode.checkName(newName));
                    String newBirthday;
                    do {
                        System.out.println("Enter Birthday Customer:");
                        newBirthday = sc.nextLine();
                    } while (!RegexCode.checkBirthday(newBirthday));
                    System.out.println("Enter the Sex Customer: ");
                    String newSex = sc.nextLine();
                    String newCMND;
                    do {
                        System.out.println("Enter CMND Customer: ");
                        newCMND = sc.nextLine();
                    } while (!RegexCode.checkCMND(newCMND));

                    System.out.println("Enter Phone Customer: ");
                    String newPhone = sc.nextLine();
                    String newEmail;
                    do {
                        System.out.println("Enter the Email Customer: ");
                        newEmail = sc.nextLine();
                    } while (!RegexCode.checkMail(newEmail));

                    System.out.println("Enter the Type Customer: \n" +
                            "1.\t Diamond \n" +
                            "2.\t Platinium \n" +
                            "3.\t Gold \n" +
                            "4.\t Silver\n" +
                            "5.\t Member");
                    int choiceTpye = Integer.parseInt(sc.nextLine());
                    String newType = "";
                    switch (choiceTpye) {
                        case 1:
                            newType = "Diamond";
                            break;
                        case 2:
                            newType = "Platinium";
                            break;
                        case 3:
                            newType = "Gold";
                            break;
                        case 4:
                            newType = "Silver";
                            break;
                        case 5:
                            newType = "Member";
                        default:
                            System.out.println("Wrong choice, please choose again !");
                    }
                    System.out.println("Enter the Address Customer: ");
                    String newAddress = sc.nextLine();
                    Customer customer = new Customer(newId, newName, newBirthday, newSex, newCMND, newPhone,
                            newEmail, newType, newAddress);
                    iCustomerService.add(customer);
                    break;
                case 3:
                    System.out.println("Enter the Id Customer:");
                    String oldId = sc.nextLine();
                    Customer ctr = iCustomerService.findById(oldId);
                    if (ctr != null) {
                        String newName1;
                        do {
                            System.out.println("Enter Name Customer: ");
                            newName1 = sc.nextLine();
                        } while (!RegexCode.checkName(newName1));
                        String newBirthday1;
                        do {
                            System.out.println("Enter Birthday Customer:");
                            newBirthday1 = sc.nextLine();
                        } while (!RegexCode.checkBirthday(newBirthday1));
                        System.out.println("Enter Sex Customer: ");
                        String newSex1 = sc.nextLine();
                        String newCMND1;
                        do {
                            System.out.println("Enter CMND Customer: ");
                            newCMND1 = sc.nextLine();
                        } while (!RegexCode.checkCMND(newCMND1));

                        System.out.println("Enter Phone Customer: ");
                        String newPhone1 = sc.nextLine();
                        String newEmail1;
                        do {
                            System.out.println("Enter Email Customer: ");
                            newEmail1 = sc.nextLine();
                        } while (!RegexCode.checkMail(newEmail1));
                        System.out.println("Enter the Type Customer: \n" +
                                "1.\t Diamond \n" +
                                "2.\t Platinium \n" +
                                "3.\t Gold \n" +
                                "4.\t Silver\n" +
                                "5.\t Member");
                        int choiceTpyeEdit = Integer.parseInt(sc.nextLine());
                        String newTypeEdit = "";
                        switch (choiceTpyeEdit) {
                            case 1:
                                newTypeEdit = "Diamond";
                                break;
                            case 2:
                                newTypeEdit = "Platinium";
                                break;
                            case 3:
                                newTypeEdit = "Gold";
                                break;
                            case 4:
                                newTypeEdit = "Silver";
                                break;
                            case 5:
                                newTypeEdit = "Member";
                            default:
                                System.out.println("Wrong choice, please choose again !");
                        }
                        System.out.println("Enter Address Customer: ");
                        String newAddress1 = sc.nextLine();
                        ctr.setName(newName1);
                        ctr.setDateBirth(newBirthday1);
                        ctr.setSex(newSex1);
                        ctr.setcMND(newCMND1);
                        ctr.setNumberPhone(newPhone1);
                        ctr.setEmail(newEmail1);
                        ctr.setCustomerType(newTypeEdit);
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
