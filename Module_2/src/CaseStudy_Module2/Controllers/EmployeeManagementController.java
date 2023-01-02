package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Services.IService.IEmployeeService;
import CaseStudy_Module2.Services.service.EmployeeServiceImpl;
import CaseStudy_Module2.Utils.RegexCode;

import java.util.Scanner;

public class EmployeeManagementController {

    public void employeeManagement() {
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
                // hiển thị danh sách nhân viên
                case 1:
                    iEmployeeService.display();
                    break;
                // thêm nhân viên mới
                case 2:
                    String newId;
                    do {
                        System.out.println("Enter ID employee: ");
                        newId = scanner.nextLine();
                    } while (!RegexCode.checkEmployeeId(newId));
                    String newName;
                    do {
                        System.out.println("Enter Name employee: ");
                        newName = scanner.nextLine();
                    } while (!RegexCode.checkName(newName));
                    String newBirthday;
                    do {
                        System.out.println("Enter Birthday:");
                        newBirthday = scanner.nextLine();
                    } while (!RegexCode.checkBirthday(newBirthday));
                    System.out.println("Enter Sex employee: ");
                    String newSex = scanner.nextLine();
                    String newCMND;
                    do {
                        System.out.println("Enter CMND employee: ");
                         newCMND = scanner.nextLine();
                    } while (!RegexCode.checkCMND(newCMND));

                    System.out.println("Enter Phone employee: ");
                    String newPhone = scanner.nextLine();
                    String newEmail;
                    do {
                        System.out.println("Enter Email employee: ");
                         newEmail = scanner.nextLine();
                    } while (!RegexCode.checkMail(newEmail));


                    System.out.println("Enter Level employee: ");
                    System.out.println("1.\t Trung cấp\n" +
                            "2.\t Cao đẳng\n" +
                            "3.\t Đại học \n" +
                            "4.\t Sau đại học");
                    int choiceLevel = Integer.parseInt(scanner.nextLine());
                    String newLevel = "";
                    switch (choiceLevel) {
                        case 1:
                            newLevel = "Trung cấp";
                            break;
                        case 2:
                            newLevel = "Cao đẳng";
                            break;
                        case 3:
                            newLevel = "Đại học";
                            break;
                        case 4:
                            newLevel = "Sau đại học";
                            break;
                    }
                    System.out.println("Enter Position employee: ");
                    System.out.println("1.\t Lễ tân\n" +
                            "2.\t Phục vụ\n" +
                            "3.\t Chuyên viên \n" +
                            "4.\t Giám sát\n" +
                            "5.\t Guản lý\n" +
                            "6.\t Giám đốc");
                    int choicePosition = Integer.parseInt(scanner.nextLine());
                    String newPosition = "";
                    switch (choicePosition) {
                        case 1:
                            newPosition = "Lễ tân";
                            break;
                        case 2:
                            newPosition= "Phục vụ";
                            break;
                        case 3:
                            newPosition = "Chuyên viên";
                            break;
                        case 4:
                            newPosition = "Giám sát";
                            break;
                        case 5:
                            newPosition = "Quản lý";
                            break;
                        case 6:
                            newPosition = "Giám đốc";
                            break;
                        default:
                            System.out.println("Wrong choice, please choose again !");
                    }
                    System.out.println("Enter Salary employee: ");
                    String newSalary = scanner.nextLine();
                    Employee employee1 = new Employee(newId, newName, newBirthday, newSex, newCMND, newPhone,
                            newEmail, newLevel, newPosition, newSalary);
                    iEmployeeService.add(employee1);
                    break;
                // Xóa nhân viên o id:
                case 3:
                    String oldId;
                    do {
                        System.out.println("Enter Id Employee: ");
                         oldId = scanner.nextLine();
                    } while (!RegexCode.checkEmployeeId(oldId));
                    iEmployeeService.deleteId(oldId);
                    break;
                // Chỉnh sửa thông tin:
                case 4:
                    String newOldId;
                    do {
                        System.out.println("Enter Id Employee:");
                         newOldId = scanner.nextLine();
                    }while (!RegexCode.checkEmployeeId(newOldId));
                    
                    Employee eml = iEmployeeService.finById(newOldId);
                    if (eml != null) {
                        String newName1;
                        do {
                            System.out.println("Enter Name employee: ");
                            newName1 = scanner.nextLine();
                        } while (!RegexCode.checkName(newName1));
                        String newBirthday1;
                        do {
                            System.out.println("Enter Birthday Employee:");
                             newBirthday1 = scanner.nextLine();
                        } while (!RegexCode.checkBirthday(newBirthday1));
                        System.out.println("Enter Sex Employee: ");
                        String newSex1 = scanner.nextLine();
                        String newCMND1;
                        do {
                            System.out.println("Enter CMND Employee: ");
                             newCMND1 = scanner.nextLine();
                        } while (!RegexCode.checkCMND(newCMND1));
                        System.out.println("Enter number Phone Employee: ");
                        String newPhone1 = scanner.nextLine();
                        String newEmail1;
                        do {
                            System.out.println("Enter Email Employee: ");
                             newEmail1 = scanner.nextLine();
                        } while (!RegexCode.checkMail(newEmail1));

                        System.out.println("Enter Level Employee: ");
                        System.out.println("1.\t Trung cấp\n" +
                                "2.\t Cao đẳng\n" +
                                "3.\t Đại học \n" +
                                "4.\t Sau đại học");
                        int choiceLevelEdit = Integer.parseInt(scanner.nextLine());
                        String newLevelEdit = "";
                        switch (choiceLevelEdit) {
                            case 1:
                                newLevelEdit = "Trung cấp";
                                break;
                            case 2:
                                newLevelEdit = "Cao đẳng";
                                break;
                            case 3:
                                newLevelEdit = "Đại học";
                                break;
                            case 4:
                                newLevelEdit = "Sau đại học";
                                break;
                            default:
                                System.out.println("Wrong choice, please choose again !");
                        }
                        System.out.println("Enter Position Employee: ");
                        System.out.println("Enter  Position employee: ");
                        System.out.println("1.\t Lễ tân\n" +
                                "2.\t Phục vụ\n" +
                                "3.\t Chuyên viên \n" +
                                "4.\t Giám sát\n" +
                                "5.\t Guản lý\n" +
                                "6.\t Giám đốc");
                        int choicePositionEdit = Integer.parseInt(scanner.nextLine());
                        String newPositionEdit = "";
                        switch (choicePositionEdit) {
                            case 1:
                                newPositionEdit = "Lễ tân";
                                break;
                            case 2:
                                newPositionEdit= "Phục vụ";
                                break;
                            case 3:
                                newPositionEdit = "Chuyên viên";
                                break;
                            case 4:
                                newPositionEdit = "Giám sát";
                                break;
                            case 5:
                                newPositionEdit = "Quản lý";
                                break;
                            case 6:
                                newPositionEdit = "Giám đốc";
                                break;
                            default:
                                System.out.println("Wrong choice, please choose again !");
                        }
                        System.out.println("Enter Salary Employee: ");
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
                    } else {
                        System.out.println("Id Employee does not exist: ");
                    }
                    break;
                case 5:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
            }
        } while (true);

    }
}
