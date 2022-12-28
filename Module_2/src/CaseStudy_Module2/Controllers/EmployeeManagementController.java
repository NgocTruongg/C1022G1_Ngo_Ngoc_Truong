package CaseStudy_Module2.Controllers;

import CaseStudy_Module2.Models.Person.Employee;
import CaseStudy_Module2.Services.IService.IEmployeeService;
import CaseStudy_Module2.Services.service.EmployeeServiceImpl;

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
                    System.out.println("Enter the name employee: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter the birthday:");
                    String newBirthday = scanner.nextLine();
                    System.out.println("Enter the Sex employee: ");
                    String newSex = scanner.nextLine();
                    System.out.println("Enter the CMND employee: ");
                    String newCMND = scanner.nextLine();
                    System.out.println("Enter the phone employee: ");
                    String newPhone = scanner.nextLine();
                    System.out.println("Enter the email employee: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("Enter the ID employee: ");
                    String newId = scanner.nextLine();
                    System.out.println("Enter the level employee: ");
                    String newLevel = scanner.nextLine();
                    System.out.println("Enter the Position employee: ");
                    String newPosition = scanner.nextLine();
                    System.out.println("Enter the Salary employee: ");
                    String newSalary = scanner.nextLine();
                    Employee employee1 = new Employee(newName, newBirthday, newSex, newCMND, newPhone,
                            newEmail, newId, newLevel, newPosition, newSalary);
                    iEmployeeService.add(employee1);
                    break;
                // Xóa nhân viên theo id:
                case 3:
                    System.out.println("Enter the Id Employee: ");
                    String oldId = scanner.nextLine();
                    iEmployeeService.deleteId(oldId);
                    break;
                // Chỉnh sửa thông tin:
                case 4:
                    System.out.println("Enter the Id Employee:");
                    String newOldId = scanner.nextLine();
                    Employee eml = iEmployeeService.finById(newOldId);
                    if (eml != null) {
                        System.out.println("Enter the Name Employee: ");
                        String newName1 = scanner.nextLine();
                        System.out.println("Enter the Employee:");
                        String newBirthday1 = scanner.nextLine();
                        System.out.println("Enter the Sex Employee: ");
                        String newSex1 = scanner.nextLine();
                        System.out.println("Enter the CMND Employee: ");
                        String newCMND1 = scanner.nextLine();
                        System.out.println("Enter the phone Employee: ");
                        String newPhone1 = scanner.nextLine();
                        System.out.println("Enter the email Employee: ");
                        String newEmail1 = scanner.nextLine();
                        System.out.println("Enter the level Employee: ");
                        String newLevel1 = scanner.nextLine();
                        System.out.println("Enter the Position Employee: ");
                        String newPosition1 = scanner.nextLine();
                        System.out.println("Enter the Salary Employee: ");
                        String newSalary1 = scanner.nextLine();
                        eml.setName(newName1);
                        eml.setDateBirth(newBirthday1);
                        eml.setSex(newSex1);
                        eml.setcMND(newCMND1);
                        eml.setNumberPhone(newPhone1);
                        eml.setEmail(newEmail1);
                        eml.setPosition(newPosition1);
                        eml.setLevel(newLevel1);
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
