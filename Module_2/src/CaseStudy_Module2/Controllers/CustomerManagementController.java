package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Customer;
import CaseStudy_Module2.Services.IService.ICustomerService;
import CaseStudy_Module2.Services.service.CustomerServiceImpl;
import CaseStudy_Module2.Utils.RegexCode;

import java.io.IOException;
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
                        if (!RegexCode.checkCustomerId(newId)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkCustomerId(newId));

                    String newName;
                    do {
                        System.out.println("Enter Name Customer: ");
                        newName = sc.nextLine();
                        if (!RegexCode.checkName(newName)) {
                            System.err.println("Retype Again");
                        }
                    }
                    while (!RegexCode.checkName(newName));

                    String newBirthday;
                    do {
                        System.out.println("Enter Birthday Customer:");
                        newBirthday = sc.nextLine();
                        if (!RegexCode.checkBirthday(newBirthday)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkBirthday(newBirthday));

                    String newSex = "";
                    do {
                        System.out.println("Enter the Sex Customer:\n" +
                                "1.\t Male \n" +
                                "2.\t Female \n" +
                                "3.\t Other Genders");
                        int choiceSex = Integer.parseInt(sc.nextLine());
                        switch (choiceSex) {
                            case 1:
                                newSex = "Male";
                                break;
                            case 2:
                                newSex = "Female";
                                break;
                            case 3:
                                newSex = "Other Genders";
                                break;
                        }
                        if (!RegexCode.checkSex(newSex)) {
                            System.err.println("Choice Again:");
                        }
                    } while (!RegexCode.checkSex(newSex));

                    String newCMND;
                    do {
                        System.out.println("Enter CMND Customer: ");
                        newCMND = sc.nextLine();
                        if (!RegexCode.checkCMND(newCMND)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkCMND(newCMND));

                    String newPhone;
                    do {
                        System.out.println("Enter Phone Customer: ");
                        newPhone = sc.nextLine();
                        if (!RegexCode.checkPhone(newPhone)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkPhone(newPhone));

                    String newEmail;
                    do {
                        System.out.println("Enter the Email Customer: ");
                        newEmail = sc.nextLine();
                        if (!RegexCode.checkMail(newEmail)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkMail(newEmail));

                    String newType = "";
                    do {
                        System.out.println("Enter the Type Customer: \n" +
                                "1.\t Diamond \n" +
                                "2.\t Platinium \n" +
                                "3.\t Gold \n" +
                                "4.\t Silver\n" +
                                "5.\t Member");
                        int choiceTpye = Integer.parseInt(sc.nextLine());
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
                        }
                        if (!RegexCode.checkType(newType)) {
                            System.err.println("Choice Again");
                        }
                    } while (!RegexCode.checkType(newType));
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
                            if (!RegexCode.checkName(newName1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkName(newName1));

                        String newBirthday1;
                        do {
                            System.out.println("Enter Birthday Customer:");
                            newBirthday1 = sc.nextLine();
                            if (!RegexCode.checkBirthday(newBirthday1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkBirthday(newBirthday1));

                        String newSex1 = "";
                        do {
                            System.out.println("Enter the Sex Customer:\n" +
                                    "1.\t Male \n" +
                                    "2.\t Female \n" +
                                    "3.\t Other Genders");
                            int choiceSex1 = Integer.parseInt(sc.nextLine());
                            switch (choiceSex1) {
                                case 1:
                                    newSex1 = "Male";
                                    break;
                                case 2:
                                    newSex1 = "Female";
                                    break;
                                case 3:
                                    newSex1 = "Other Genders";
                                    break;
                            }
                            if (!RegexCode.checkSex(newSex1)) {
                                System.err.println("Choice Again:");
                            }
                        } while (!RegexCode.checkSex(newSex1));

                        String newCMND1;
                        do {
                            System.out.println("Enter CMND Customer: ");
                            newCMND1 = sc.nextLine();
                            if (!RegexCode.checkCMND(newCMND1)) {
                                System.err.println("Retype Again:");
                            }
                        } while (!RegexCode.checkCMND(newCMND1));

                        String newPhone1;
                        do {
                            System.out.println("Enter Phone Customer: ");
                            newPhone1 = sc.nextLine();
                            if (!RegexCode.checkPhone(newPhone1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkPhone(newPhone1));

                        String newEmail1;
                        do {
                            System.out.println("Enter Email Customer: ");
                            newEmail1 = sc.nextLine();
                            if (!RegexCode.checkMail(newEmail1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkMail(newEmail1));

                        String newTypeEdit = "";
                        do {
                            System.out.println("Enter the Type Customer: \n" +
                                    "1.\t Diamond \n" +
                                    "2.\t Platinium \n" +
                                    "3.\t Gold \n" +
                                    "4.\t Silver\n" +
                                    "5.\t Member");
                            int choiceTypeEdit = Integer.parseInt(sc.nextLine());
                            switch (choiceTypeEdit) {
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
                                    break;
                            }
                            if (!RegexCode.checkType(newTypeEdit)) {
                                System.err.println("Choice Again:");
                            }
                        } while (!RegexCode.checkType(newTypeEdit));

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

                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please choice again: ");
            }
        } while (true);
    }
}
