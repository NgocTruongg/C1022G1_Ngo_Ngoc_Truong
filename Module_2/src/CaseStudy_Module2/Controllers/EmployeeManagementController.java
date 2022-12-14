package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Services.IService.IEmployeeService;
import CaseStudy_Module2.Services.service.EmployeeServiceImpl;
import CaseStudy_Module2.Utils.RegexCode;
import com.sun.org.apache.regexp.internal.RE;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagementController {

    public void employeeManagement(){
        IEmployeeService iEmployeeService = new EmployeeServiceImpl();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Employee Management:");
            System.out.println("1.\tDisplay list employees:\n" +
                    "2.\tAdd new employee: \n" +
                    "3.\tDelete employee: \n" +
                    "4.\tEdit employee: \n" +
                    "5.\tReturn main menu:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    String newId;
                    do {
                        System.out.println("Enter ID employee: ");
                        newId = scanner.nextLine();
                        if (!RegexCode.checkEmployeeId(newId)) {
                            System.out.println("Retype Again");
                        }
                    } while (!RegexCode.checkEmployeeId(newId));

                    String newName;
                    do {
                        System.out.println("Enter Name employee: ");
                        newName = scanner.nextLine();
                        if (!RegexCode.checkName(newName)) {
                            System.out.println("Retype Again");
                        }
                    } while (!RegexCode.checkName(newName));

                    String newBirthday;
                    do {
                        System.out.println("Enter Birthday:");
                        newBirthday = scanner.nextLine();
                        if (!RegexCode.checkBirthday(newBirthday)) {
                            System.out.println("Retype Again");
                        }
                    } while (!RegexCode.checkBirthday(newBirthday));

                    String newSex = "";
                    do {
                        System.out.println("Enter the Sex Customer:\n" +
                                "1.\t Male \n" +
                                "2.\t Female \n" +
                                "3.\t Other Genders");
                        int choiceSex1 = Integer.parseInt(scanner.nextLine());
                        switch (choiceSex1) {
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
                        System.out.println("Enter CMND employee: ");
                        newCMND = scanner.nextLine();
                        if (!RegexCode.checkCMND(newCMND)) {
                            System.err.println("Choice Again:");
                        }
                    } while (!RegexCode.checkCMND(newCMND));

                    String newPhone;
                    do {
                        System.out.println("Enter Phone Customer: ");
                        newPhone = scanner.nextLine();
                        if (!RegexCode.checkPhone(newPhone)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkPhone(newPhone));

                    String newEmail;
                    do {
                        System.out.println("Enter Email employee: ");
                        newEmail = scanner.nextLine();
                        if (!RegexCode.checkMail(newEmail)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkMail(newEmail));

                    String newLevel = "";
                    do {
                        System.out.println("Enter Level employee: ");
                        System.out.println("1.\t Trung c???p\n" +
                                "2.\t Cao ?????ng\n" +
                                "3.\t ?????i h???c \n" +
                                "4.\t Sau ?????i h???c");
                        int choiceLevel = Integer.parseInt(scanner.nextLine());
                        switch (choiceLevel) {
                            case 1:
                                newLevel = "Trung c???p";
                                break;
                            case 2:
                                newLevel = "Cao ?????ng";
                                break;
                            case 3:
                                newLevel = "?????i h???c";
                                break;
                            case 4:
                                newLevel = "Sau ?????i h???c";
                                break;
                        }
                        if (!RegexCode.checkLevel(newLevel)) {
                            System.err.println("Choice Again");
                        }
                    } while (!RegexCode.checkLevel(newLevel));

                    String newPosition = "";
                    do {
                        System.out.println("Enter Position employee: ");
                        System.out.println("1.\t L??? t??n\n" +
                                "2.\t Ph???c v???\n" +
                                "3.\t Chuy??n vi??n \n" +
                                "4.\t Gi??m s??t\n" +
                                "5.\t Qu???n l??\n" +
                                "6.\t Gi??m ?????c");
                        int choicePosition = Integer.parseInt(scanner.nextLine());
                        switch (choicePosition) {
                            case 1:
                                newPosition = "L??? t??n";
                                break;
                            case 2:
                                newPosition = "Ph???c v???";
                                break;
                            case 3:
                                newPosition = "Chuy??n vi??n";
                                break;
                            case 4:
                                newPosition = "Gi??m s??t";
                                break;
                            case 5:
                                newPosition = "Qu???n l??";
                                break;
                            case 6:
                                newPosition = "Gi??m ?????c";
                                break;
                        }
                            if (!RegexCode.checkPosition(newPosition)) {
                                System.err.println("Wrong choice, please choose again !");
                        }
                    }while (!RegexCode.checkPosition(newPosition));

                    System.out.println("Enter Salary employee: ");
                    String newSalary = scanner.nextLine();

                    Employee employee1 = new Employee(newId, newName, newBirthday, newSex, newCMND, newPhone,
                            newEmail, newLevel, newPosition, newSalary);
                    iEmployeeService.add(employee1);
                    break;
                // X??a nh??n vi??n  id:
                case 3:
                    String oldId;
                    do {
                        System.out.println("Enter Id Employee: ");
                        oldId = scanner.nextLine();
                        if (!RegexCode.checkEmployeeId(oldId)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkEmployeeId(oldId));
                    iEmployeeService.deleteId(oldId);
                    break;
                // Ch???nh s???a th??ng tin:
                case 4:
                    String newOldId;
                    do {
                        System.out.println("Enter Id Employee:");
                        newOldId = scanner.nextLine();
                        if (!RegexCode.checkEmployeeId(newOldId)) {
                            System.err.println("Retype Again");
                        }
                    } while (!RegexCode.checkEmployeeId(newOldId));
                    Employee eml = iEmployeeService.finById(newOldId);
                    if (eml != null) {
                        String newName1;
                        do {
                            System.out.println("Enter Name employee: ");
                            newName1 = scanner.nextLine();
                            if (!RegexCode.checkName(newName1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkName(newName1));
                        String newBirthday1;
                        do {
                            System.out.println("Enter Birthday:");
                            newBirthday1 = scanner.nextLine();
                            if (!RegexCode.checkBirthday(newBirthday1)) {
                                System.out.println("Retype Again");
                            }
                        } while (!RegexCode.checkBirthday(newBirthday1));

                        String newSex1 = "";
                        do {
                            System.out.println("Enter the Sex Customer:\n" +
                                    "1.\t Male \n" +
                                    "2.\t Female \n" +
                                    "3.\t Other Genders");
                            int choiceSex = Integer.parseInt(scanner.nextLine());
                            switch (choiceSex) {
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
                            System.out.println("Enter CMND employee: ");
                            newCMND1 = scanner.nextLine();
                            if (!RegexCode.checkCMND(newCMND1)) {
                                System.err.println("Choice Again:");
                            }
                        } while (!RegexCode.checkCMND(newCMND1));

                        String newPhone1;
                        do {
                            System.out.println("Enter Phone Customer: ");
                            newPhone1 = scanner.nextLine();
                            if (!RegexCode.checkPhone(newPhone1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkPhone(newPhone1));

                        String newEmail1;
                        do {
                            System.out.println("Enter Email employee: ");
                            newEmail1 = scanner.nextLine();
                            if (!RegexCode.checkMail(newEmail1)) {
                                System.err.println("Retype Again");
                            }
                        } while (!RegexCode.checkMail(newEmail1));

                        String newLevelEdit = "";
                        do {
                            System.out.println("Enter Level employee: ");
                            System.out.println("1.\t Trung c???p\n" +
                                    "2.\t Cao ?????ng\n" +
                                    "3.\t ?????i h???c \n" +
                                    "4.\t Sau ?????i h???c");
                            int choiceLevel1 = Integer.parseInt(scanner.nextLine());
                            switch (choiceLevel1) {
                                case 1:
                                    newLevelEdit = "Trung c???p";
                                    break;
                                case 2:
                                    newLevelEdit = "Cao ?????ng";
                                    break;
                                case 3:
                                    newLevelEdit = "?????i h???c";
                                    break;
                                case 4:
                                    newLevelEdit = "Sau ?????i h???c";
                                    break;
                            }
                            if (!RegexCode.checkLevel(newLevelEdit)) {
                                System.err.println("Choice Again");
                            }
                        } while (!RegexCode.checkLevel(newLevelEdit));

                        String newPositionEdit = "";
                        do {
                            System.out.println("Enter Position employee: ");
                            System.out.println("1.\t L??? t??n\n" +
                                    "2.\t Ph???c v???\n" +
                                    "3.\t Chuy??n vi??n \n" +
                                    "4.\t Gi??m s??t\n" +
                                    "5.\t Qu???n l??\n" +
                                    "6.\t Gi??m ?????c");
                            int choicePosition1 = Integer.parseInt(scanner.nextLine());
                            System.out.println(choicePosition1);
                            switch (choicePosition1) {
                                case 1:
                                    newPositionEdit = "L??? t??n";
                                    break;
                                case 2:
                                    newPositionEdit = "Ph???c v???";
                                    break;
                                case 3:
                                    newPositionEdit = "Chuy??n vi??n";
                                    break;
                                case 4:
                                    newPositionEdit = "Gi??m s??t";
                                    break;
                                case 5:
                                    newPositionEdit = "Qu???n l??";
                                    break;
                                case 6:
                                    newPositionEdit = "Gi??m ?????c";
                                    break;
                            }
                            if (!RegexCode.checkPosition(newPositionEdit)) {
                                System.err.println("Wrong choice, please choice again !");
                            }
                        }while (!RegexCode.checkPosition(newPositionEdit));

                        System.out.println("Enter Salary employee: ");

                        String newSalary1 = scanner.nextLine();
                        eml.setName(newName1);
                        eml.setDateBirth(newBirthday1);
                        eml.setSex(newSex1);
                        eml.setcMND(newCMND1);
                        eml.setNumberPhone(newPhone1);
                        eml.setEmail(newEmail1);
                        eml.setPosition(newPositionEdit);
                        eml.setLevel(newLevelEdit);
                        eml.setSalary(newSalary1);
                        iEmployeeService.edit(eml);
                    }
                    break;
                case 5:
                    return;
            }
        } while (true);

    }
}
