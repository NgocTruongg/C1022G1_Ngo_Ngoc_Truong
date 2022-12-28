package CaseStudy_Module2.Controllers;

import java.util.Scanner;

public class FacilityManagementController {

    public void facilityManagement () {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("----Facility Management----");
            System.out.println("1\tDisplay list facility: \n" +
                    "2\tAdd new facility: \n" +
                    "3\tDisplay list facility maintenance: \n" +
                    "4\tReturn main menu: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choiceService =Integer.parseInt(scanner.nextLine());
                    System.out.println("List of Facility: \n" +
                            "1.\t Room:\n" +
                            "2.\t Villa:");
                    System.out.println("What kind of service do you want to choice?");
                    switch (choiceService) {
                        case 1:
//                            /////
                            break;
                        case 2:
//                            ////
                            break;
                    }
                case 2:
                    int choiceAdd = Integer.parseInt(scanner.nextLine());
                    System.out.println("list of Facility: \n" +
                            "1.\t Add new Villa\n" +
                            "2.\t Add new Room \n" +
                            "3.\t Back to Menu");
                    System.out.println("What kind of service do you want to add?");
                    switch (choiceAdd) {
                        case 1:
                            // thêm dịch vụ villa
                        case 2:
                            // thêm dịch vụ room
                        case 3:
                            // quay lại menu
                    }
                case 3:
                    // hiển thị danh sách cơ sở bảo trì
                case 4:
                    // quay lại menu chính
            }
        } while (true);
    }
}
